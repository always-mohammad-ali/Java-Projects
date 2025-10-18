#!/bin/bash

#Get the username dynamically
USER_NAME=$(whoami)

for item in ../$USER_NAME/*; do
  if[ -d "$item" ]; then
      DIR_NAME=$(basename "$item")
      echo "../home/$USER_NAME contains --> $DIR_NAME"

   fi
done
echo "this is the last directory --> exercise 6"
