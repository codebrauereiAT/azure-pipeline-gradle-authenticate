rootProject.name = "gradle-test-project"

dependencyResolutionManagement {
    repositories {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        maven {
            url = uri("https://pkgs.dev.azure.com/codebrauerei/_packaging/codebrauerei/maven/v1")
            name = "codebrauerei"
            credentials(PasswordCredentials::class)
        }
    }
}
