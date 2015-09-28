# DdsIheGazelleClient
## webservice client for the ihe gazelle demograhic data server

oliver egger, 28.9.2015

The demographic Data Server is a tool that generates random demographic informations, and make them available for tools to use for testing purpose. The demographic Data Serfver (DDS) is proivde by IHE within the Gazelle eHealth test framework for interoperability, see documentation [here](http://gazelle.ihe.net/content/dds-demographic-data-server). the webservice client generates 2500 random swiss patients and outputs them to the console.

### executing

make a runnable jar and start the main class DdsIheGazelleClient in ch.ahdis.ihe.pix.ddswsclient

### background

```
docker build --rm=true -t postgres_db230 .
```

