# Getting Involved #

The potential of Impala can only be realised with the help of others in the developer community. With the 1.0 release now out, there is no better time to get involved.
Contributions would be very welcome in a wide range of areas:

### Testing Impala in different environments ###
Testing so far has been mostly on Jetty 6 and Tomcat 5.5. It would be good to extend testing to other application servers.
I am happy to set up a wiki page for users to report their experiences (and work arounds) for particular app server versions,
and tickets can obviously be raised in the issue tracker for specific issues.

### Extending Impala web framework support ###
While Impala will work with any web framework through traditional Spring integration techniques,
the aim is to have web framework integration which takes advantage of Spring's dynamic nature.
So far we've got Spring MVC (of course), Struts, Struts2, Wicket, JSF and Tapestry examples. Do you have another framework you would like to use with Impala. We can add this to the [web frameworks sample](SamplesWebFramework.md).

### Further enhancements to Maven support ###
There is a Maven plugin and [sample](SamplesMaven.md). It would be great to extend this support to make sure that the needs of day-in day-out Maven users are covered.
It would be great to have archetypes to kick-start project creation and module addition.

### Bug reporting ###
If you encounter any issue when using Impala, your effort in recording this in the ticket tracker will be appreciated.

### Bug fixes ###
Even better, taken on one of the existing tickets in the ticket database, and submit a patch.

### Documentation ###
If you have some knowledge about Impala which you would like to share, it can be added to the wiki.

### Sample applications ###
In particular I have in mind a sample application developed specifically for Impala, which showcases its features and best practices.
There's a detailed description of what I have in mind [here](OpenSourceJumpStart.md).

### Release co-ordination ###
This is the less glamorous but still critical (and time-consuming) part of any open source project. Doing the release builds, announcements, etc.

### Logo ###
It's criminal, but Impala still hasn't got a logo. If you're a ace graphic designer (I'm sorry, but I'm very fussy on this one), I'd love to hear from you.

### Web Site ###
Impala desperately needs a web site where the key messages of the project can be presented in a more visually appealing way.
The GoogleCode home page is just too dull, and ironically, does not seem to show up well on Google searches.

### Project leadership ###
Help to steer the course of future developments (obviously subject to prior contributions in other areas)!

### Evangelism ###
If you're willing to get up and talk about Impala this will be especially valued!!

### Anything else on the roadmap ###
See the Roadmap - http://code.google.com/p/impala/wiki/Roadmap.

## Are you interested? ##

In a previous project I was approached by a various people asking me _What can I do?_. Typically, I'd suggest something, and then would not hear from the person again.

So if you're interested in getting involved, let this show in your actions. Don't wait to be told what you should do. Only you know your own interests, skills and capabilities, which makes you the best person to decide how you can help. Check out the source, and run the examples. Then come up with a suggestion of how you can help. I will be supportive of your efforts as long as your contribution is of high quality and doesn't conflict with the objectives of the project as a whole.

Some guidelines:
  * if you contribute code, make sure it comes with unit tests and that these tests run as part of the overall suite.
  * if you contribute Java, use the Spring coding conventions described on this page: http://www.springsource.org/development
  * use the public tools. I have set up a group and Google Code provides a good issue tracker.