package com.example.exception;

/**   
* @Title: ResultStatusEnum.java 
* @Package: com.emdata.common.exception 
* @Description: commonResultStatus
* @author: Minko liuming@em-data.com.cn
* @date 2018年7月13日 上午10:26:31 
* @version V1.0
*/
public enum ResultStatusEnum {
	
	SUCCESS(0, "请求成功"),		// 请求接口成功

    NEW_MEMBER(4103, "新用户，需要弹窗同意"),
	
	// 注册中心【10000 - 19999】
	
	// 网关【20000 - 29999】
	
	// 消息通知 【30000 - 39999】
	/** 消息通知开始 **/
	MOBILE_ERROR(30001, "不合法的手机号"),
	ACCESSTOKEN_ERROR(30002, "不合法的accessToken，请认真比对accessToken的有效性（如是否过期）"),
	CHARACTER_ERROR(30003, "不合法的请求字符，不能包含\\uxxxx格式的字符"),
	PARAM_ERROR(30004, "不合法的参数"),
	REQUEST_ERROR(30005, "不合法的请求格式"),
	APPID_ERROR(30006, "不合法的AppID,请检查APPID正确性，避免异常字符，注意大小写"),
	MSGCODE_ERROR(30007, "不合法的手机验证码"),
	
	APPKEY_EMPTY(31001, "缺少appKey参数"),
	APPID_EMPTY(31002, "缺少appid参数"),
	MSGCODE_EMPTY(31003, "缺少手机验证码参数"),
	MOBILE_EMPTY(31004, "缺少mobile参数"),
	ACCESSTOKEN_EMPTY(31005, "缺少accessToken参数"),
	APPNAME_EMPTY(31006, "缺少应用名称"),
	
	
	MSGCODE_SENDFREQUENT(32001, "短信验证码发送过于频繁"),
	MSGCODE_EXPIRED(32002, "手机验证码已过期"),
	MSGCODE_SENDSYSERROR(32003, "短信验证码发送异常"),
	ACCESSTOKEN_MORETHANLIMIT(32004, "accessToken超过当日获取限制，每日限制为300次"),
	ACCESSTOKEN_TIMEOUT(32005, "accessToken超时，请检查accessToken的有效期，请参考获取accessToken中，对accessToken的详细机制说明"),
	
	APPNAME_EXIST(33001, "应用名称已存在，无法继续添加"),
	
	NOT_SUPPORT_GET_ERROR(39001, "不支持GET请求"),
	NOT_SUPPOERT_POST_ERROR(39002, "不支持POST请求"),
	NOT_SUPPOERT_PUT_ERROR(39003, "不支持PUT请求"),
	NOT_SUPPOERT_DELETE_ERROR(39004, "不支持DELETE请求"),
	
	
	
	/** 消息通知结束 **/
	
	
	// 权限 【40000 - 49999】
	
	
	// 人脸模块 【50000 - 59999】
	
	FILE_EMPTY(50001, "缺少文件参数"),
	IMG_SIZE_NOT_DEFINED(50002, "图片处理参数未定义，请联系device服务"),
	FILE_IS_NOT_IMG(50003, "文件不是图片类型"),
	
	// 设备服务模块【60000 - 69999】
	CAMERA_SAVE_FAILED(60001, "设备保存失败"),
	CAMERA_UPDATE_FAILED(60002, "设备更新失败"),
	CAMERA_DELETE_FAILED(60003, "设备删除失败"),
	CAMERA_UUID_EMPTY(60004, "设备UUID为空"),
	CAMERAINFO_PARAM_EMPTY(60005, "设备相关信息为空"),
	CAMERA_PARAM_EMPTY(60006, "摄像头相关信息为空"),
	ALGINPUTPICINFO_PARAM_EMPTY(60007, "图片输入特征信息为空"),
	ALGOUTPUTPICINFO_PARAM_EMPTY(60008, "算法输出图片格式设置信息为空"),
	DEVICEINFO_PARAM_EMPTY(60009, "设备厂商信息为空"),
	STREAM_PARAM_EMPTY(60010, "流媒体相关设置为空"),
	MONITORSPOT_SAVE_FAILED(60011, "监控点保存失败"),
	MONITORSPOT_UPDATE_FAILED(60012, "监控点更新失败"),
	MONITORSPOT_DELETE_FAILED(60013, "监控点删除失败"),
	MONITORSPOTOPENTIME_SAVE_FAILED(60014, "监控点常开设置保存失败"),
	MONITORSPOTOPENTIME_UPDATE_FAILED(60015, "监控点常开设置更新失败"),
	MONITORSPOTOPENTIME_DELETE_FAILED(60016,"监控点常开设置删除失败"),
	MONITORSPOT_UUID_EMPTY(60017, "监控点UUID为空"),
	DEVCONTROLLER_SAVE_FAILED(60018, "设备控制器保存失败"),
	DEVCONTROLLER_UPDATE_FAILED(60019, "设备控制器更新失败"),
	DEVCONTROLLER_DELETE_FAILED(60020,  "设备控制器删除失败"),
	ALGINPUTPICINFO_SAVE_FAILED(60021, "输入图片信息保存失败"),
	ALGINPUTPICINFO_UPDATE_FAILED(60022, "输入图片信息更新失败"),
	ALGINPUTPICINFO_DELETE_FAILED(60023, "输入图片信息删除失败"),
	ALGOUTPUTPICINFO_SAVE_FAILED(60021, "输出图片信息保存失败"),
	ALGOUTPUTPICINFO_UPDATE_FAILED(60022, "输出图片信息更新失败"),
	ALGOUTPUTPICINFO_DELETE_FAILED(60023, "输出图片信息删除失败"),
	DEVICEINFO_SAVE_FAILED(60024, "设备厂商信息保存失败"),
	DEVICEINFO_UPDATE_FAILED(60025, "设备厂商信息更新失败"),
	DEVICEINFO_DELETE_FAILED(60026, "设备厂商信息删除失败"),
	STREAMINFO_SAVE_FAILED(60024, "流媒体信息保存失败"),
	STREAMINFO_UPDATE_FAILED(60025, "流媒体信息更新失败"),
	STREAMINFO_DELETE_FAILED(60026, "流媒体信息删除失败"),
	ALGORITHM_SAVE_FAILED(60024, "算法保存失败"),
	ALGORITHM_UPDATE_FAILED(60025, "算法更新失败"),
	ALGORITHM_DELETE_FAILED(60026, "算法删除失败"),
	DEVICESERVICE_SAVE_FAILED(60027, "设备服务保存失败"),
	DEVICESERVICE_UPDATE_FAILED(60028, "设备服务更新失败"),
	DEVICESERVICE_DELETE_FAILED(60029, "设备服务删除失败"),
	REGION_SAVE_FAILED(60030, "区域保存失败"),
	REGION_UPDATE_FAILED(60031, "区域更新失败"),
	REGION_DELETE_FAILED(60032, "区域删除失败"),
	
	CAMERA_NAME_EMPTY(61001, "缺少设备名称参数"),
	CAMERA_DEVICEIP_EMPTY(61002, "缺少设备ip参数"),
	CAMERA_USERNAME_EMPTY(61003, "缺少设备连接用户名参数"),
	CAMERA_PASSWORD_EMPTY(61004, "缺少设备连接密码参数"),
	CAMERA_ACTIVE_EMPTY(61005, "缺少设备是否可用参数"),
	CAMERA_STATUS_EMPTY(61006, "缺少设备状态参数"),
	CAMERA_PORT_EMPTY(61007, "缺少设备端口参数"),
	CAMERA_DIRECTION_EMPTY(61008, "缺少设备方向参数"),
	CAMERA_DIVICEINFOUUID_EMPTY(61009, "缺少设备信息UUID参数"),
	CAMERA_ALGOUTPUTPICINFOUUID_EMPTY(61010, "缺少设备图片输出信息UUID参数"),
	CAMERA_STREAMINFOUUID_EMPTY(61011, "缺少设备流信息UUID参数"),
	CAMERA_ALGINPUTPICINFOUUID_EMPTY(61012, "缺少设备图片输入信息UUID参数"),
	CAMERA_ALGORITHMUUID_EMPTY(61013, "缺少设备算法UUID参数"),
	CAMERA_MONITORSPOTUUID_EMPTY(61014, "缺少设备监控点UUID参数"),
	
	
	// 项目模块【70000 - 79999】
	PERSON_NAME_EMPTY(70000, "缺少姓名参数"),
	PERSON_REGIONUUID_EMPTY(70001, "缺少区域参数"),
	
	PERSON_SAVE_FAILED(70002, "人员保存失败"),
	PERSON_UPDATE_FAILED(70002, "人员更新失败"),
	PERSON_DELETE_FAILED(70002, "人员删除失败"),
	FACERECOGINIZERESULT_SAVE_FAILED(70003, "人脸识别结果保存失败！"),
	PIC_DELETE_FAILDE(70004, "人员图片删除失败"),
	LINK_PERSON_ERROR(70005, "人员关联失败"),
	PIC_UUID_EMPTY(70006, "缺少图片uuid参数"),
	PERSON_UUID_EMPTY(70007, "缺少人员UUID参数"),
	PERSON_PIC_EMPTY(70008, "缺少图片参数"),
	PERSON_NOT_EXIST(70009, "人员已不存在"),
	IGNORE_GROUP_FAILED(70010, "忽略分组失败"),
	
	
	ERROR(-1, "系统繁忙，请稍后重试");
	
	
	private int code;
	private String message;
	
	private ResultStatusEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}

}
