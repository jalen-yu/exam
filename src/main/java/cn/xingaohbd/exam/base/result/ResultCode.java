package cn.xingaohbd.exam.base.result;

public enum ResultCode {
	
	//秒杀课程code 500100-500199
	SECKILL_LINE_UP(500100,"排队中"),
	SECKILL_NO_QUOTE(500101,"非常抱歉该课程名额已满"),
	SECKILL_BOUGHT(500102,"你已经购买该课程，请去订单页面查看"),
	SECKILL_PATH_ERROR(500104,"你的请求地址不正确，请联系小姐姐"),
	SECKILL_IP_OUTMAX(500105,"你的请求过于频繁，请稍后再试"),
	
	SUCCESS(200,"成功"),
	FATL(500,"失败"),
	USER_LOGIN_ERROR(500201,"登录失败，用户名或密码错误，请重新输入"),
	USER_REGIST_SUCCESS(200200,"注册成功,请登录"),
	USER_REGIST_ERROR(500200,"注冊失败，用户名已经存在，请重新输入");
	
	private Integer code;
	
	private String message;
	
	ResultCode(Integer code,String message){
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
