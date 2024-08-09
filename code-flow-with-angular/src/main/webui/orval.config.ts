import { defineConfig } from 'orval';

export default defineConfig({
  code_flow_with_angular: {
    input: {
      target: 'src/generated/openapi.yaml',
    },
    output: {
      mode: 'tags-split',
      target: 'src/generated/',
      schemas: 'src/generated/model',
      client: 'angular'
    }
  },
});
