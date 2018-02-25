# MCLinkEventTester
Just a quick plugin that responds to an event generated by [this MCLink branch](https://github.com/Brianetta/MCLink_Mod/tree/bukkit_event).

To build:

 - Check out and build MCLink
 - Check out this repo
 - install MCLink in Maven locally: `mvn install:install-file -Dfile=./Bukkit/build/libs/MCLink-Bukkit-0.2.1.jar -DgroupId=net.dries007.mclink -DartifactId=MCLink-Bukkit -Dversion=0.2.1 -Dpackaging=jar`
 - Build with maven: `mvn package`

To run, simply include in your Bukkit plugins folder alongside the MCLink plugin. You do need to be using the branch with the event.  