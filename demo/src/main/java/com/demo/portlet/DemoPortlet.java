package com.demo.portlet;

import com.demo.constants.DemoPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Giuseppe
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.QFS",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Demo",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + DemoPortletKeys.DEMO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user", "com.demo.name=My First Portlet"
	},
	service = Portlet.class
)
public class DemoPortlet extends MVCPortlet {
}
