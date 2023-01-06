This project recreates a working version of the project provided as an example at
https://github.com/micronaut-projects/micronaut-spring/issues/270.
I additional has a JUnit5 test to show that it passes. Still not sure why the original Spock test fails.

---

Building and running this project also requires the subproject `examples:micronaut-lib`
from guthub.com:jamesdh/micronaut-spring.git (i.e. publishToMavenLocal)
- I build the jar and added it to /lib as a file dependency, so that example subproject is only needed if the co changes 




