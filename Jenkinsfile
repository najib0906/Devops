pipeline {
    agent any
    environment {
    		DOCKERHUB_CREDENTIALS=credentials('dockerhub_id')
  }
  stages {
    stage('login to docker'){
      steps{
          sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
      }
    }
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'cd back && chmod +x mvnw && ./mvnw clean package'
                sh 'cd front && npm install'
                sh 'cd front && npm run build'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Build Docker Images') {
            steps {
                sh 'docker build -t backend:latest -f back/Dockerfile .'
                sh 'docker build -t frontend:latest -f front/Dockerfile .'
            }
        }
        stage('Push to Docker Hub') {
            steps {
                sh "docker tag backend:latest $DOCKER_HUB_USERNAME/backend:latest"
                sh "docker tag frontend:latest $DOCKER_HUB_USERNAME/frontend:latest"
                sh "docker push $DOCKER_HUB_USERNAME/backend:latest"
                sh "docker push $DOCKER_HUB_USERNAME/frontend:latest"
            }
        }
    }
}
