/**************************************************************************
 * Copyright (c) 2015-2017 Zhejiang TaChao Network Technology Co.,Ltd.
 * All rights reserved.
 * 
 * 项目名称：浙江踏潮-汇道体育
 * 版权说明：本软件属浙江踏潮网络科技有限公司所有，在未获得浙江踏潮网络科技有限公司正式授权
 *           情况下，任何企业和个人，不能获取、阅读、安装、传播本软件涉及的任何受知
 *           识产权保护的内容。                            
 ***************************************************************************/
package com.zjtachao.test.pattern.oper.p11;


 /**
 * TODO 请在此处添加注释
 * @author <a href="mailto:dh@zjtachao.com">duhao</a>
 * @version $Id$   
 * @since 2.0
 */

public class PersonFactory {

	/** 
	 * 
	   * 获得指定人
	   * @param name
	   * @return
	 */
	public Person getPerson(String name){
		Person person = null;
		if("zhansan".equalsIgnoreCase(name)){
			person = new Zhangsan();
		}else if("lisi".equalsIgnoreCase(name)){
			person = new Lisi();
		}
		return person;
	}

}
