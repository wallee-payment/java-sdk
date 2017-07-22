#!/bin/sh
# ref: https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
#
# Usage example: /bin/sh ./git_push.sh "release note"

git_organisation_id="wallee-payment"
git_repo_id="wallee-java-sdk"
release_note=$1

if [ -z "$release_note" ]; then
    echo "[ERROR] No release note defined."
    exit 1
fi

script_dir=`pwd`

# Create a temporary directory
tmp_dir=`mktemp -d`
cd $tmp_dir
echo "Created temporary directory ${tmp_dir}"

# Clone the repository into the temporary directory
git clone https://github.com/${git_organisation_id}/${git_repo_id}.git
cd $git_repo_id
echo "Cloned repository '${git_organisation_id}/${git_repo_id}' into temporary directory"

# Remove all cloned files, except for the .git folder
find . -path ./.git -prune -o -exec rm -rf {} \; 2> /dev/null

# Copy the generated files into the temporary folder
cp -r $script_dir/. .

# Adds the files in the local repository and stages them for commit.
git add .

# Commits the tracked changes and prepares them to be pushed to a remote repository.
git commit -m "$release_note"

# Pushes (Forces) the changes in the local repository up to the remote repository
echo "Git pushing to https://github.com/${git_organisation_id}/${git_repo_id}.git"
git push origin master 2>&1 | grep -v 'To https'

# Delete temporary folder
cd $script_dir
rm -rf $tmp_dir