package com.versionone.apiclient.integration.tests;

import junit.framework.Assert;

import org.junit.Test;

public class ConfigurationTests {

	// private IAPIConfiguration _target;

	// @Before
	// public void setup() throws IOException {
	// _target = new APIConfiguration();
	// }

	@Test
	public void testGetV1Url() {
		String v1Url = APIClientSuiteIT.getInstanceUrl().getV1Url();
		Assert.assertTrue(v1Url.length() != 0);
		Assert.assertTrue(v1Url.startsWith("http"));
		Assert.assertTrue(v1Url.endsWith("/"));
	}

	@Test
	public void testGetDataUrl() {
		String dataUrl = APIClientSuiteIT.getInstanceUrl().getDataUrl();
		Assert.assertTrue(dataUrl.length() != 0);
		Assert.assertTrue(dataUrl.endsWith("rest-1.v1/")); // reasonable assumption...for now
	}

	@Test
	public void testGetMetaUrl() {
		String metaUrl = APIClientSuiteIT.getInstanceUrl().getMetaUrl();
		Assert.assertTrue(metaUrl.length() != 0);
		Assert.assertTrue(metaUrl.endsWith("meta.v1/")); // reasonable assumption...for now
	}

	@Test
	public void testGetUserName() {
		String userName = APIClientSuiteIT.getInstanceUrl().getV1UserName();
		Assert.assertTrue(userName.length() != 0);
	}

	@Test
	public void testGetPassword() {
		String password = APIClientSuiteIT.getInstanceUrl().getV1Password();
		Assert.assertTrue(password.length() != 0);
	}

	@Test
	public void testGetConfigUrl() {
		String configUrl = APIClientSuiteIT.getInstanceUrl().getConfigUrl();
		Assert.assertTrue(configUrl.length() != 0);
	}

	@Test
	public void testGetProxyUrl() {
		String proxyUrl = APIClientSuiteIT.getInstanceUrl().getProxyUrl();
		Assert.assertTrue(proxyUrl.length() != 0);
		Assert.assertTrue(proxyUrl.startsWith("http"));
	}

	@Test
	public void testGetProxyUserName() {
		String userName = APIClientSuiteIT.getInstanceUrl().getProxyUserName();
		Assert.assertTrue(userName.length() != 0);
	}

	@Test
	public void testGetProxyPassword() {
		String password = APIClientSuiteIT.getInstanceUrl().getProxyPassword();
		Assert.assertTrue(password.length() != 0);
	}
}
