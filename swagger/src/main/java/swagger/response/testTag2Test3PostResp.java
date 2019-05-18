package swagger.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
public class testTag2Test3PostResp {
	@ApiModelProperty(name = "userid", value = "userid", example = "3")
	public int userid;
	@ApiModelProperty(name = "funds", value = "funds", example = "1111")
	public double funds;
	@ApiModelProperty(name = "name", value = "name", example = "aaa")
	public String name;
}
