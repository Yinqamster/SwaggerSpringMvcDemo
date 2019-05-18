package swagger.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import swagger.response.Response;
import swagger.response.testTag1Test1GetResp;
import swagger.response.testTag1Test2UseridPostResp;

@RestController
@RequestMapping("/testTag1")
//@Api
//@Api(tags = "testTag1", value = "testTag1 value")
@Api(tags = "testTag1")
//@Api(value = "testTag1 value")
public class testTag1Controller {

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "tag1 test1", response = Response.class, notes = "test notes", tags = "testTag2")
//	@ApiOperation(value = "tag1 test1", notes = "test notes")
	public Response<testTag1Test1GetResp> test1() {
		Response<testTag1Test1GetResp> response = new Response<testTag1Test1GetResp>();
		response.code = 0;
		response.message = "test1 ok!";
		testTag1Test1GetResp data = new testTag1Test1GetResp();
		data.id = 333;
		data.name = "response name";
		response.data = data;
		return response;
	}
	
//	@RequestMapping(value = "/test2/{user_id}", method = RequestMethod.POST)
//	@ResponseBody
//	@ApiOperation(value = "tag1 test2")
//	public Response<testTag1Test2PostResp> test2(HttpServletRequest request,
//			@PathVariable(value = "user_id") Integer userid,
//			@RequestParam(value = "funds", required = true, defaultValue = "111.222") Double funds) {
//		Response<testTag1Test2PostResp> response = new Response<testTag1Test2PostResp>();
//		response.code = 0;
//		response.message = "test2 message";
//		testTag1Test2PostResp data = new testTag1Test2PostResp();
//		data.userid = userid;
//		data.funds = funds;
//		response.data = data;
//		return response;
//	}
	
	
//	@RequestMapping(value = "/test2/{user_id}", method = RequestMethod.POST)
//	@ResponseBody
//	@ApiOperation(value = "tag1 test2")
//	@ApiImplicitParams ({
//		@ApiImplicitParam(name = "user_id", value = "user id", required = true, dataType = "int", paramType = "path", allowableValues = "1,2,3"),
//		@ApiImplicitParam(name = "funds", value = "user funds", required = false, dataType = "double", paramType = "query", defaultValue = "111.222")
//	})
//	public Response<testTag1Test2PostResp> test2(HttpServletRequest request,
//			@PathVariable int user_id, @RequestParam double funds) {
//		Response<testTag1Test2PostResp> response = new Response<testTag1Test2PostResp>();
//		response.code = 0;
//		response.message = "test2 message";
//		testTag1Test2PostResp data = new testTag1Test2PostResp();
//		data.userid = user_id;
//		data.funds = funds;
//		response.data = data;
//		return response;
//	}
	
	
	@RequestMapping(value = "/test2/{user_id}", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "tag1 test2")
	public Response<testTag1Test2UseridPostResp> test2(HttpServletRequest request,
			@ApiParam(required = true, allowableValues = "1,2,3,4,5", value = "user id")
			@PathVariable(value = "user_id") Integer userid,
			@ApiParam(required = true, defaultValue = "111.222", value = "user funds")
			@RequestParam(value = "funds", required = true) Double funds) {
		Response<testTag1Test2UseridPostResp> response = new Response<testTag1Test2UseridPostResp>();
		response.code = 0;
		response.message = "test2 message";
		testTag1Test2UseridPostResp data = new testTag1Test2UseridPostResp();
		data.userid = userid;
		data.funds = funds;
		response.data = data;
		return response;
	}
	
	
	
	
	
	
}