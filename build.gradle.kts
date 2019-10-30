plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("wolfs")
    githubRepoName.set("developer-productivity-engineering-jugm2019")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}