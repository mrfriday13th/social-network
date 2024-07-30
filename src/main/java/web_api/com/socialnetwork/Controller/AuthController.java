package web_api.com.socialnetwork.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import web_api.com.socialnetwork.Response.BaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class AuthController {
// @Operation(summary = "API signup")

	// @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "register succesfully", content = {
	// 		@Content(mediaType = "application/json", schema = @Schema(implementation = RegistUserRepDto.class)) }),
	// 		@ApiResponse(responseCode = "400", description = "Invalid account", content = @Content) })
	// @PostMapping("/sign-up")
	// public BaseResponse<UserInforSignupResDto> register(@RequestBody @Valid RegistUserRepDto userInfo) {
	// 	UserInforSignupResDto resDto = service.insertUser(userInfo);
	// 	return BaseResponse.<UserInforSignupResDto>builder().result(resDto).message(CommonConstants.REGISTER_SUCCESS)
	// 			.build();
	// }
}
