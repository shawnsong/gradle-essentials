# Gradle Essentials

## Chapter 1
### Gradle Tasks
```shell
gradle help

# Display gradle tasks
gradle tasks

# Display all gradle tasks
gradle tasks --all
```
### Gradle Wrapper

To generate the wrapper scripts and supporting files, just execute the following code from the command line:
```shell
graddle wrapper
```
To generate wrapper scripts for a specific gradle version:
```shell
$GRADLE_VERSION=3.4 # 2.9
gradle wrapper --gradle-version $GRADLE_VERSION
```
This is extremely useful for CI/CD because gradle does not needed to be installed on CI/CD servers.

### Running a build via wrapper
```shell
# syntax is ./gradlew [taskname]
./gradlew helloWorld
```