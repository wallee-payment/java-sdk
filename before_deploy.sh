#!/usr/bin/env bash

echo "[INFO] Running before_deploy script"
openssl aes-256-cbc -K $encrypted_85ed150a0e11_key -iv $encrypted_85ed150a0e11_iv -in codesigning.asc.enc -out codesigning.asc -d
gpg --fast-import codesigning.asc

if [ -z ${TRAVIS_TAG}]; 
then
	echo "[INFO] This is not tagged build. The TRAVIS_TAG is not set. Skipping before_deploy step.";

elif [ "$TRAVIS_BRANCH" = 'master' ] && [ "$TRAVIS_PULL_REQUEST" == 'false' ];
then
	echo "[INFO] Running before_deploy script. Decrypting 'codesigning.asc.enc'..."
	openssl aes-256-cbc -K $encrypted_85ed150a0e11_key -iv $encrypted_85ed150a0e11_iv -in codesigning.asc.enc -out codesigning.asc -d && \
	gpg --fast-import codesigning.asc

else
	echo "[INFO] Not on master branch or this is a pull request. Skipping before_deploy step."
fi