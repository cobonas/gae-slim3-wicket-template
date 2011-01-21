package app;

import javax.servlet.http.HttpServletRequest;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WebRequest;
import org.apache.wicket.session.ISessionStore;

import appengine.wicket.AppEngineWebApplicationHelper;

public class WicketApplication extends WebApplication{

	AppEngineWebApplicationHelper helper = new AppEngineWebApplicationHelper(this);

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}
	
	@Override
	public String getConfigurationType() {
		return helper.getConfigurationType();
	}

	@Override
	protected ISessionStore newSessionStore() {
		return helper.newSessionStore();
	}

	@Override
	protected WebRequest newWebRequest(HttpServletRequest servletRequest) {
		return helper.newWebRequest(servletRequest);
	}

}
