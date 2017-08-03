#!/usr/bin/env bash

echo "[INFO] Running deploy based on the mvn_settings.xml"
mvn deploy -P sign,build-extras --settings mvn_settings.xml