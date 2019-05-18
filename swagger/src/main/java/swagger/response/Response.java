package swagger.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "test api model")
public class Response<T> {

	@ApiModelProperty(name = "code", value = "code", example = "123")
	public int code;
	@ApiModelProperty(name = "message", value = "message", example = "test message")
	public String message;
	@ApiModelProperty(name = "data", value = "data")
	public T data;
	
}
