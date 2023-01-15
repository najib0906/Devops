FROM node:14

# set working directory
WORKDIR /src

# copy package.json and package-lock.json
COPY package*.json ./

# install dependencies
RUN npm install

# copy all files
COPY . .

# build the project
RUN npm run build

# expose port
EXPOSE 4200

# run command
CMD ["npm", "start"]
