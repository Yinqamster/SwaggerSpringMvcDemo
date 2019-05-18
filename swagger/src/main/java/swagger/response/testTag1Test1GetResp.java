package swagger.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class testTag1Test1GetResp {
	@ApiModelProperty(name = "id", value = "id", example = "1")
	public int id;
	@ApiModelProperty(name = "name", value = "name", example = "abc")
	public String name;
	
}
