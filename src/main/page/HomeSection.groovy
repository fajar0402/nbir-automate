package page

import geb.Page
import module.SidebarNavigation

/**
 * Created by C07HJAXNDJD0 on 4/12/16.
 */
class HomeSection extends Page {

    static content = {

        sidebarModule {module SidebarNavigation}

    }

}
