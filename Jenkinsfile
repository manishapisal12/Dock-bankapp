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
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
            } 
                echo "Trying to Push Docker Build to DockerHub"
    }
	stage('pull image'){
	    docker.withRegistry('https://registry.hub.docker.com'){ 

            app = docker.image('new1:latest')
            app.pull()
			}
			    echo "Trying to pull docker image from dockerhub"
}

}
