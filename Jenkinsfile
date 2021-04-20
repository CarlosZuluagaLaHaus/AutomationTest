pipeline {
    agent any

    stages {
        stage("Compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }

        stages {
            stage('Test') {
              steps {
                sh './gradlew clean build -P env=prod'
              }
            }
        }
    }
}