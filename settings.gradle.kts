
rootProject.name = "GradleMultModuleTest"
include("moduleOne")
include("moduleOne:app")
findProject(":moduleOne:app")?.name = "app"
include("moduleOne:domain")
//findProject(":moduleOne:domain")?.name = "domain"
include("moduleTwo")
include("moduleTwo:app")
//findProject(":moduleTwo:app")?.name = "app"
include("moduleTwo:domain")
//findProject(":moduleTwo:domain")?.name = "domain"
