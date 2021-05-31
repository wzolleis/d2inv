rootProject.name = "divinv-app"

include("divinv-frontend", "divinv-backend")

buildCache {
    local {
          removeUnusedEntriesAfterDays = 30
    }
}