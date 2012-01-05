package ws.albors;

import org.kohsuke.stapler.DataBoundConstructor;

import hudson.Extension;
import hudson.views.ViewsTabBar;
import hudson.views.ViewsTabBarDescriptor;

public class CountJobsViewsTabBar extends ViewsTabBar {
    
	@DataBoundConstructor
    public CountJobsViewsTabBar() {	
	}
    @Extension
    public static class DescriptorImpl extends ViewsTabBarDescriptor {

        @Override
        public String getDisplayName() {
            return "CountJobs Views TabBar";
        }
    }
}
