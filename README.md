# Adobe AEM 6 Sightly TodoMVC Example

Sightly is the new HTML templating system, introduced with AEM 6.0. It takes the place of JSP (Java Server Pages) and ESP (ECMAScript Server Pages) as the preferred HTML templating system for AEM.

This is the code from my Sightly demo at the Connect Web Experience Conference 2014.

Thanks to the [TodoMVC Team](http://todomvc.com)

## Learning Sightly

The [Sightly Documentation on the AEM Site](http://docs.adobe.com/docs/en/aem/6-0/develop/sightly.html) is a great resource for getting started.

[JavaDoc for Use API](http://dev.day.com/content/docs/en/aem/6-0/develop/ref/javadoc/com/adobe/cq/sightly/WCMUse.html)


Get help from other Framework Name users:

* [sightlyio](https://twitter.com/sightlyio)
* [Senol](https://twitter.com/thelabertasch)

If you are interested to learn how we came up with Sightly, check out my [Behind the Scenes Youtube channel](https://www.youtube.com/playlist?list=PLkBe8kbE_7-xeo5uNJVE4uZXRpOpCA0J8) 

## Implementation

The Example Content Node is located in http://localhost:4502/todomvc.html (component: todomvc/mainpanel)

Following Components are Implemented

* /todovc -> app/jcr_root/apps/todomvc/mainpanel
* /todovc/header -> app/jcr_root/apps/todomvc/header
* /todomvc/main/selectallaction -> app/jcr_root/apps/todomvc/selectallaction
* /todomvc/main/listitems -> app/jcr_root/apps/todomvc/listitems
** Demonstrating server side javascript / use api usage
* /todomvc/main/listitems/todos/*todoitems* -> app/jcr_root/apps/todomvc/item
* /todomvc/main/destroyaction-> app/jcr_root/apps/todomvc/destroyaction
* /todomvc/todocount-> app/jcr_root/apps/todomvc/todocount
** Demonstrating Java use api usage

I did not (yet) implement the full TodoMVC spec. Perhaps I will do so to demonstrate new functionality and/or for upcoming Sightly DEMO on AEM/CQ conferences.

This Sightly Example is work in progress...

## Running

Create a ZIP file from the apps folder and upload it via the [AEM Package Manager](http://docs.adobe.com/docs/en/aem/6-0/administer/content/package-manager.html)

To run the app, spin up an HTTP server and visit http://localhost:4502/todomvc.html


## Credit

This TodoMVC application was created by [Senol](https://twitter.com/thelabertasch).