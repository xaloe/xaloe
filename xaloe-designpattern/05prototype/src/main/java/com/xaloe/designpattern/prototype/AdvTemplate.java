package com.xaloe.designpattern.prototype;

/**
 * 
 * TODO (广告模板)
 * <p>
 * </p>
 * 
 * @author xie_zhibing@163.com
 * 
 */
public class AdvTemplate {

	/** 广告邮件标题 */
	private String subject = "快乐旅行团新推航线";
	/** 广告邮件内容 */
	private String context = "快乐旅行团，暑期新航线出炉了，敬请会员关注您感兴趣信息";

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}
