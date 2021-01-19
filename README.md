# Chuck Norris Quote Generator for Spring Boot Actuator

## Description
Random Chuck Norris quote generator for Spring Boot Actuator 

## Installation and Usage
1. Add SFG Chuck Norris for Actuator to your project

#### Maven:

```
<dependency>
    <groupId>guru.springframework</groupId>
    <artifactId>chuck-norris-for-actuator</artifactId>
    <version>2.4.0</version>
</dependency>
```
         
#### Gradle:
```
compile group: 'guru.springframework', name: 'chuck-norris-for-actuator', version: '2.4.0'
```
         
2. Add Bean Configuration to your Spring Boot Project
```     
@Bean
public ChuckNorrisInfoContributor chuckNorrisInfoContributor(){
  return new ChuckNorrisInfoContributor();
}
```
              
3. Start you application, go to /info

```
{
    "Chuck Norris" : "Maslow's theory of higher needs does not apply to Chuck Norris. He only has two needs: killing people and finding people to kill."
}
 ```