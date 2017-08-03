#!/usr/bin/env bash

openssl aes-256-cbc -K $encrypted_85ed150a0e11_key -iv $encrypted_85ed150a0e11_iv -in codesigning.asc.enc -out codesigning.asc -d && \
gpg --fast-import signingkey.asc