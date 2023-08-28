import com.example.chieegateway.CommunityDtos.BoardReplyDto;
import com.example.chieegateway.CommunityDtos.CommentDto;
import com.example.chieegateway.CommunityDtos.BoardDto;
import com.example.chieegateway.CommunityDtos.CommentSaveDto;
import com.example.chieegateway.MatchDtos.CurrentMatchDto;
import com.example.chieegateway.MatchDtos.GetEstimateDto;
import com.example.chieegateway.MatchDtos.SaveEstimateDto;
import com.example.chieegateway.MatchDtos.SaveMatchDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "community")
public interface CommunityServiceFeign {

    @GetMapping("/comment/test")
    public String test();

    @PostMapping("/comment/save")
    public void save(@RequestBody CommentSaveDto commentSaveDto);

    @PostMapping("/comment/save/{parentId}")
    public void saveReComment(@PathVariable String parentId, @RequestBody CommentSaveDto commentSaveDto);

    @GetMapping("/comment/good/{id}")
    public void updateGood(@PathVariable String id);

    @GetMapping("/board")
    public List<BoardReplyDto> getAll();

    @PostMapping("/board/save")
    public void saveBoard(@RequestBody BoardDto boardDto);

    @DeleteMapping("/board/delete/{id}/{userId}")
    public void deleteBoard(@PathVariable String id,@PathVariable String userId);

    @PostMapping("/board/file/{userEmail}")
    public void fileUpload(@RequestPart MultipartFile file, @PathVariable String userEmail);

    @GetMapping("/board/get/comment/{boardId}")
    public List<CommentDto> getAllComments(@PathVariable String boardId);

    @GetMapping("/board/get/image")
    public List<String> getImage();

    @PostMapping("/estimate/save")
    public void saveEstimate(@RequestBody SaveEstimateDto saveEstimateDto);


    @GetMapping("/estimate/get/user/{userId}")
    public List<GetEstimateDto> getEstimateByUserEmail(@PathVariable  String userId);


    @GetMapping("/estimate/get/id/{id}")
    public GetEstimateDto getEstimateById(@PathVariable String id);

    @GetMapping("/estimate/get/type/{type}")
    public List<GetEstimateDto> getEstimateByType(@PathVariable String type);


    @GetMapping("/match/accept/match/{matchId}")
    public CurrentMatchDto acceptMatch(@PathVariable String matchId);

    @GetMapping("/match/get/mentee/{menteeId}")
    public List<CurrentMatchDto> getMatchByMentee(@PathVariable String menteeId);

    @GetMapping("/match/get/mentor/{mentorId}")
    public List<CurrentMatchDto> getMatchByMentor(@PathVariable String mentorId);

    @PostMapping("/match/save")
    public void matchSave(@RequestBody SaveMatchDto saveMatchDto);

    @GetMapping("/match/delete/{id}")
    public void matchDelete(@PathVariable String id);
}
