package swagger.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.swing.RepaintManager;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import swagger.request.testTag2Test3PostReq;
import swagger.response.Response;
import swagger.response.testTag2Test3PostResp;

@RestController
@RequestMapping("/testTag2")
@Api(tags = "testTag2", value = "testTag2")
public class testTag2Controller {

	@RequestMapping(value = "/test3", method = RequestMethod.POST)
	@ResponseBody
	@ApiResponses({
		@ApiResponse(code = 400, message = "something wrong", response = IOException.class),
	})
	@ApiOperation(value = "tag2 test3")
	public Response<testTag2Test3PostResp> test3(HttpServletRequest request,
			@RequestBody testTag2Test3PostReq req) {
		Response<testTag2Test3PostResp> response = new Response<testTag2Test3PostResp>();
		response.code = 0;
		response.message = "test3 ok!";
		testTag2Test3PostResp data = new testTag2Test3PostResp();
		data.funds = req.funds;
		data.name = req.name;
		data.userid = req.userid;
		response.data = data;
		return response;
	}
	
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "tag2 test4", response = Response.class)
	public Response<String> test4() {
		Response<String> response = new Response<String>();
		response.code = 0;
		response.message = "test4 ok!";
		return response;
	}
}
