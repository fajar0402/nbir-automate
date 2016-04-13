package module

import geb.Module

/**
 * Created by C07HJAXNDJD0 on 4/12/16.
 */
class SidebarNavigation extends Module {

    static content = {

        //Sidebar Navigation
        nbirLogo             {$('li.nbir-logo')}
        logoBtn              {$('a#homeButton')}
        avoidTheBiteBtn      {$('a#avoidButton')}
        nbirTourBtn          {$('a#tourButton')}
        tickPreventionBtn    {$('a#tickButton')}
        fleaPrevention       {$('a#fleaButton')}
        talkWithYourVet      {$('a#talkButton')}
        twitterFeed          {$('a#twittButton')}
        contactUs            {$('a#contactButton')}
        languagePreference   {$('li.nbir-change-language.ng-binding')}

    }
}
