node {
    def app

    stage('Clone repository') {
        /* Cloning the Repository to our Workspace */

        checkout scm
    }

    stage('Build image') {
        /* This builds the actual image */

        app = docker.build("manishapisal12/new2")
    }

   
    stage('Push image') {
        /* 
			You would need to first register with DockerHub before you can push images to your account
		*/
        docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest1")
            } 
                echo "Trying to Push Docker Build to DockerHub"
    }
	stage('pull image'){
	    docker.withRegistry('https://registry.hub.docker.com''dockerhub'){ 

            app = docker.image('manishapisal12/new2')
            app.pull("latest1")
			}
			    echo "Trying to pull docker image from dockerhub"
}

}
