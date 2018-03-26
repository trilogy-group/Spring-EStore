Build the app
We are ready to build the app. Make sure you are still at the top level of your new directory. Here’s what ls should show:

$ ls
Dockerfile		app.py			requirements.txt
Now run the build command. This creates a Docker image, which we’re going to tag using -t so it has a friendly name.

docker build -t friendlyhello .
Where is your built image? It’s in your machine’s local Docker image registry:

$ docker image ls

REPOSITORY            TAG                 IMAGE ID
friendlyhello         latest              326387cea398
Run the app
Run the app, mapping your machine’s port 4000 to the container’s published port 80 using -p:

docker run -p 4000:80 friendlyhello
You should see a message that Python is serving your app at http://0.0.0.0:80. But that message is coming from inside the container, which doesn’t know you mapped port 80 of that container to 4000, making the correct URL http://localhost:4000.

Go to that URL in a web browser to see the display content served up on a web page.


Tag the image
docker tag image username/repository:tag
For example:
docker tag friendlyhello faisalhameed/repo-name:part2

Run docker image ls to see your newly tagged image.
$ docker image ls

Publish the image
Upload your tagged image to the repository:

>>docker push username/repository:tag

Pull and run the image from the remote repository
From now on, you can use docker run and run your app on any machine with this command:

>>docker run -p 4000:80 faisalhameed/repo-name:part2


Link : https://docs.docker.com/get-started/



Services (docker-compose.yml)

https://docs.docker.com/get-started/part3/#your-first-docker-composeyml-file