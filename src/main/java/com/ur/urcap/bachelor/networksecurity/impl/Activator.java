package com.ur.urcap.bachelor.networksecurity.impl;

import com.ur.urcap.api.contribution.InstallationNodeService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator
{

    public void start(BundleContext context) throws Exception
    {
        NetworkSecurityInstallationNodeService netSecInstall = new NetworkSecurityInstallationNodeService();

        context.registerService(InstallationNodeService.class, netSecInstall, null);
    }

    public void stop(BundleContext context) throws Exception
    {
        // TODO add deactivation code here
    }

}
