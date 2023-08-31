import com.example.chieegateway.AccountDtos.response.ResultResponse;
import com.example.chieegateway.StreamingDtos.VODGroupNameUpdateRequestDto;
import com.example.chieegateway.StreamingDtos.VODGroupRegistrationRequestDto;
import com.example.chieegateway.StreamingDtos.VODRegistrationRequestDto;
import com.example.chieegateway.StreamingDtos.VODTitleUpdateRequestDto;
import com.example.chieegateway.StreamingDtos.aws.FinishUploadMultipartRequestDto;
import com.example.chieegateway.StreamingDtos.aws.MultipartUploadRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "streaming")
public interface StreamingServiceFeign {
    final String VOD_API_URI = "streaming/api/vod";
    final String VODGROUP_API_URI = "streaming/api/vodGroup";
    @PostMapping(VOD_API_URI+"/registration")
    public ResponseEntity<ResultResponse> registerVOD(
            @RequestPart("data") VODRegistrationRequestDto vodRegistrationRequestDto,
            @RequestPart("thumbnail") MultipartFile thumbnail
    );

    @PostMapping(VOD_API_URI+"/upload")
    public ResponseEntity<ResultResponse> uploadVOD(
            @RequestPart("data") MultipartUploadRequestDto multipartUploadRequestDto,
            @RequestPart("file") MultipartFile file
    );

    @PostMapping(VOD_API_URI+"/completeUpload")
    public ResponseEntity<ResultResponse> completeUploadVOD(
            @RequestBody FinishUploadMultipartRequestDto finishUploadMultipartRequestDto
    );

    @PostMapping(VOD_API_URI+"/update/VODTitle")
    public ResponseEntity<ResultResponse> updateVODTitle(
            @RequestBody VODTitleUpdateRequestDto vodTitleUpdateRequestDto
    );

    @GetMapping(VODGROUP_API_URI+"/List")
    public ResponseEntity<ResultResponse> getVODGroupList();

    @GetMapping(VODGROUP_API_URI+"/list/detail/{vodGroupId}")
    public ResponseEntity<ResultResponse> getVODGroupDetail(
            @PathVariable("vodGroupId") String vodGroupId
    );

    @GetMapping(VODGROUP_API_URI+"/list/{mentorId}")
    public ResponseEntity<ResultResponse> getVODGroupListByMentorId(
            @PathVariable("mentorId") String mentorId
    );

    @PostMapping(VODGROUP_API_URI+"/registration")
    public ResponseEntity<ResultResponse> createVODGroup(
            @RequestPart("data") VODGroupRegistrationRequestDto vodGroupRegistrationRequestDto,
            @RequestPart("thumbnail") MultipartFile thumbnail
    );

    @PostMapping(VODGROUP_API_URI+"/update/vodGroupTitle")
    public ResponseEntity<ResultResponse> updateVODGroupTitle(
            @RequestBody VODGroupNameUpdateRequestDto vodGroupNameUpdateRequestDto
    );

    @GetMapping(VODGROUP_API_URI+"/{keyword}")
    public ResponseEntity<ResultResponse> searchVODGroupByKeyword(
            @PathVariable("keyword") String keyword
    );
}
