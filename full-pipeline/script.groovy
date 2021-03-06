def buildJar(){
    echo "building the application..."
    sh "mvn package"
}

def buildImage(String imageName){
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: "docker-hub-credentials", passwordVariable: "PASS", usernameVariable: "USER")])
    {
        sh "docker build -t ${imageName}:dev-2.0 ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push ${imageName}:dev-2.0"
    }
}

return this