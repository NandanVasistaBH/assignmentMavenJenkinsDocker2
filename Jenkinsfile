pipeline {
    agent any
    environment {
        PATH = "C:/Users/e039325/Downloads/apache-maven-3.9.8-bin/apache-maven-3.9.8/bin;${env.PATH}"
    }
    stages {
        stage('Clone') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/NandanVasistaBH/mavenJenkinsDocker.git']]
                ])
            }
        }
        stage('List Files') {
            steps {
                bat "dir"
            }
        }
        stage("Maven") {
            steps {
                bat "mvn install"
            }
        }
        stage("Pull an image to check if docker exists"){
            steps{
                bat "docker pull mongo"
            }
        }
        stage("Build Docker image") {
            steps {
                script {
                    bat "docker build -t nandan/assignment-maven ."
                }
            }
        }
    }
}
