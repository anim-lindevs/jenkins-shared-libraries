def call(String imageName, String imageTag, String dockerHubUser){
   withCredentials([usernamePassword('credentialsId':"dockerhubcreds",usernameVariable:"dockerHubUser",passwordVariable:"dockerHubPass")]){
                 sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                 sh "docker push ${dockerHubUser}/${imageName}:${imageTag}"

   }
  
}
