import com.example.chieegateway.CommunityDtos.ReplyBoard;
import com.example.chieegateway.CommunityDtos.ReplyComment;
import com.example.chieegateway.CommunityDtos.SaveBoard;
import com.example.chieegateway.CommunityDtos.SaveComment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@FeignClient(name = "community")
public interface CommunityServiceFeign {

    @GetMapping("/comment/test")
    public String test();

    @PostMapping("/comment/save")
    public void save(@RequestBody SaveComment saveComment);

    @PostMapping("/comment/save/{parentId}")
    public void saveReComment(@PathVariable String parentId, @RequestBody SaveComment saveComment);

    @GetMapping("/comment/good/{id}")
    public void updateGood(@PathVariable String id);

    @GetMapping("/board")
    public List<ReplyBoard> getAll();

    @PostMapping("/board/save")
    public void saveBoard(@RequestBody SaveBoard boardDto);

    @DeleteMapping("/board/delete/{id}/{userId}")
    public void deleteBoard(@PathVariable String id,@PathVariable String userId);

    @PostMapping("/board/file/{userEmail}")
    public void fileUpload(@RequestPart MultipartFile file, @PathVariable String userEmail);

    @GetMapping("/board/get/comment/{boardId}")
    public List<ReplyComment> getAllComments(@PathVariable String boardId);

    @GetMapping("/board/get/image")
    public List<String> getImage();
}
