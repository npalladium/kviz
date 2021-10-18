// eslint-disable-next-line @typescript-eslint/ban-ts-comment
// @ts-ignore
import ky from "ky";

type R<U> = Promise<U & { uri: string }>;
class Repository<T> {
  async get<T>(url: string): R<T> {
    return ky.get(url).json();
  }
}
