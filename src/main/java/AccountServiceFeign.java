import com.example.chieegateway.AccountDtos.keyword.KeywordDeleteRequest;
import com.example.chieegateway.AccountDtos.keyword.KeywordRegistrationRequest;
import com.example.chieegateway.AccountDtos.keyword.KeywordUpdateRequest;
import com.example.chieegateway.AccountDtos.member.MemberLoginRequest;
import com.example.chieegateway.AccountDtos.member.MemberPasswordUpdateRequest;
import com.example.chieegateway.AccountDtos.member.MemberRegistrationRequest;
import com.example.chieegateway.AccountDtos.member.MemberUpdateRequest;
import com.example.chieegateway.AccountDtos.member.TokenRefreshRequest;
import com.example.chieegateway.AccountDtos.member.TokenValidateRequest;
import com.example.chieegateway.AccountDtos.response.ResultResponse;
import com.example.chieegateway.AccountDtos.role.RoleDeleteRequest;
import com.example.chieegateway.AccountDtos.role.RoleRegistrationRequest;
import com.example.chieegateway.AccountDtos.role.RoleUpdateRequest;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "account")
public interface AccountServiceFeign {
  @PostMapping("/api/auth/signup")
  public ResponseEntity<ResultResponse> registration(@RequestBody @Valid MemberRegistrationRequest memberRegistrationRequest);

  @PostMapping("/api/auth/signin")
  public ResponseEntity<ResultResponse> Login(@RequestBody MemberLoginRequest memberLoginRequest);

  @GetMapping("/api/auth/logout")
  public ResponseEntity<ResultResponse> Logout();

  @PostMapping("/api/auth/refresh")
  public ResponseEntity<ResultResponse> refreshToken(@RequestBody TokenRefreshRequest tokenRefreshRequest);

  @PostMapping("/api/auth/validate")
  public ResponseEntity<ResultResponse> validateToken(@RequestBody TokenValidateRequest tokenValidateRequest);

  @GetMapping("/api/member/info/{email}")
  public ResponseEntity<ResultResponse> getMemberInfo(@PathVariable String email);

  @GetMapping("/api/member/delete/{email}")
  public ResponseEntity<ResultResponse> deleteMember(@PathVariable String email);

  @GetMapping("/api/member/list")
  public ResponseEntity<ResultResponse> getMemberList();

  @PostMapping("/api/member/update/common")
  public String update(@RequestBody MemberUpdateRequest memberUpdateRequest);

  @PostMapping("/api/member/update/password")
  public String updatePassword(@RequestBody MemberPasswordUpdateRequest memberPasswordUpdateRequest);

  @GetMapping("/api/keyword/list")
  public ResponseEntity<ResultResponse> getKeywordList();

  @PostMapping("/api/keyword/add")
  public ResponseEntity<ResultResponse> addKeyword(@RequestBody KeywordRegistrationRequest keywordRegistrationRequest);

  @PostMapping("/api/keyword/delete")
  public ResponseEntity<ResultResponse> deleteKeyword(@RequestBody KeywordDeleteRequest keywordDeleteRequest);

  @PostMapping("/api/keyword/update")
  public ResponseEntity<ResultResponse> updateKeyword(@RequestBody KeywordUpdateRequest keywordUpdateRequest);

  @PostMapping("/api/role/add")
  public ResponseEntity<ResultResponse> addRole(@RequestBody RoleRegistrationRequest roleRegistrationRequest);

  @PostMapping("/api/role/delete")
  public ResponseEntity<ResultResponse> deleteRole(@RequestBody RoleDeleteRequest roleDeleteRequest);

  @GetMapping("/api/role/list")
  public ResponseEntity<ResultResponse> getRoleList();

  @PostMapping("/api/role/update")
  public ResponseEntity<ResultResponse> updateRole(@RequestBody RoleUpdateRequest roleUpdateRequest);

}
