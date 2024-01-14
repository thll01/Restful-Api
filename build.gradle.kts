

plugins {
    id("java")
    id ("org.springframework.boot") version "3.0.5"
    id ("io.spring.dependency-management") version "1.1.1"
}

group = "org.fmi.homework"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.springframework.boot:spring-boot-starter")
    implementation ("org.springframework.boot:spring-boot-starter-web")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.springdoc:springdoc-openai-starter-webmvc-ui:2.2.0")
}

tasks.test {
    useJUnitPlatform()
}