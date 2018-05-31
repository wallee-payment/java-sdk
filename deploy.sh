#!/usr/bin/env bash

if [ -z "${TRAVIS_TAG}" ]; 
then
	echo "[INFO] This is not tagged build. The TRAVIS_TAG is not set. Skipping deployment.";

else
	echo "[INFO] Running deployment based on the mvn_settings.xml"
	mvn deploy -P sign,build-extras --settings mvn_settings.xml;
fi