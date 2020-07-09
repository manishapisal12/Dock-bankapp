FROM ubuntu
MAINTAINER manisha pisal
HEALTHCHECK --interval=5s \
            --timeout=5s \
			CMD curl -f http://127.0.0.1:8000 || exit
EXPOSE 8000			
