let {add} = require("../src/Add");

describe("Add number", () => {
   it("add should return sum", () => {
       expect(add(1,2)).toBe(3);
   })
});