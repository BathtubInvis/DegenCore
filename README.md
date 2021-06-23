# DegenCore
A simple minecraft API to help with forge modding

## How To Use DegenCore (DegenerateCore) In Your Projects

### build.gradle dependencies block
```gradle
repositories {
        maven {
            url = uri("https://maven.pkg.github.com/BathtubInvis/DegenCore")
            credentials {
                username = '<GithubUsername>'
                password = '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'
            }
        }
    }

    implementation("me.filthyWeebDegenerate.degenerateCore:degen-core:${project.degenCoreVersion}") {
        exclude group: 'net.minecraftforge'
    }
```

### gradle.properties

```properties
degenCoreVersion=desiredVersion (e.g. 1.1.0)
```
