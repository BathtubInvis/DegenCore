# DegenCore
A simple minecraft API to help with forge modding

## How To Use DegenCore (DegenerateCore) In Your Projects
### Add the following to your 'build.gradle'

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

    implementation('me.filthyWeebDegenerate.degenerateCore:degen-core:1.1.0') {
        exclude group: 'net.minecraftforge'
    }
```
