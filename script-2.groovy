def buildApp(){
    echo "building application....."
}

def testApp(){
    echo "testing application....."
}

def deployApp(){
    echo "deploying application....."
    echo "deploying version ${params.VERSION}"
    echo "Deploying to ${ENV}" 
}

return this