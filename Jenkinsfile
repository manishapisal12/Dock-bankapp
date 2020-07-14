node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Workspace */

        checkout scm
    }

    stage('Build image') {
        /* This builds the actual image */

        app = docker.build("manishapisal12/new1")
    }

   

    stage('Push image') {
        /* 
			You would need to first register with DockerHub before you can push images to your account
		*/
        docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
            app.pull("${env.BUILD_NUMBER}")
            app.pull("latest")
            } 
                echo "Trying to Push Docker Build to DockerHub"
    }
}
