const fs = require('fs');

const file0Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_0.json';
const file1Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_1.json';
const file2Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_2.json';
const file3Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_3.json';
const file4Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_4.json';
const file5Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_5.json';
const file6Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_6.json';
const file7Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_7.json';
const file8Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_8.json';
const file9Path = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\people_9.json';

const file0Content = fs.readFileSync(file0Path, 'utf8');
const file1Content = fs.readFileSync(file1Path, 'utf8');
const file2Content = fs.readFileSync(file2Path, 'utf8');
const file3Content = fs.readFileSync(file3Path, 'utf8');
const file4Content = fs.readFileSync(file4Path, 'utf8');
const file5Content = fs.readFileSync(file5Path, 'utf8');
const file6Content = fs.readFileSync(file6Path, 'utf8');
const file7Content = fs.readFileSync(file7Path, 'utf8');
const file8Content = fs.readFileSync(file8Path, 'utf8');
const file9Content = fs.readFileSync(file9Path, 'utf8');

const json0 = JSON.parse(file0Content);
const json1 = JSON.parse(file1Content);
const json2 = JSON.parse(file2Content);
const json3 = JSON.parse(file3Content);
const json4 = JSON.parse(file4Content);
const json5 = JSON.parse(file5Content);
const json6 = JSON.parse(file6Content);
const json7 = JSON.parse(file7Content);
const json8 = JSON.parse(file8Content);
const json9 = JSON.parse(file9Content);

const mergedJSON = [...json0, ...json1, ...json2, ...json3, ...json4, ...json5, ...json6, ...json7, ...json8, ...json9];

const mergedFilePath = 'C:\\Users\\kn134\\Downloads\\Stream & Json\\src\\main\\resources\\static\\Json\\merged.json';
fs.writeFileSync(mergedFilePath, JSON.stringify(mergedJSON, null, 10));

console.log('File JSON đã được gộp thành công.');
